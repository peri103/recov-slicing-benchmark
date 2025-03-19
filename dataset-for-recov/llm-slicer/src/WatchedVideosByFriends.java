import java.util.*;
class WatchedVideosByFriends {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n = friends.length;
        Deque<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        Map<String, Integer> freq = new HashMap<>();
        
        int dist = 0;
        q.addLast(id);
        visited[id] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int u = q.removeFirst();
                if (dist == level) {
                    for (String video : watchedVideos.get(u)) {
                        freq.put(video, freq.getOrDefault(video, 0) + 1);
                    }
                }
                for (int v : friends[u]) {
                    if (!visited[v]) {
                        visited[v] = true;
                        q.addLast(v);
                    }
                }
            }
            if (dist == level) break;
            dist++;
        }
        List<String> ans = new ArrayList<>(freq.keySet());
        Collections.sort(ans, (String s1,String s2) -> {
            if (freq.get(s1) == freq.get(s2)) {
                return s1.compareTo(s2);
            }
            return Integer.compare(freq.get(s1), freq.get(s2));
        });
        return ans;
    }
    public static void main(String[] args) {
        WatchedVideosByFriends watchedVideosByFriends = new WatchedVideosByFriends();
        
        List<List<String>> watchedVideos = new ArrayList<>();
        watchedVideos.add(Arrays.asList("A", "B"));
        watchedVideos.add(Arrays.asList("C"));
        watchedVideos.add(Arrays.asList("B", "C"));
        watchedVideos.add(Arrays.asList("D"));
        
        int[][] friends = {
            {1, 2},
            {0, 3},
            {0, 3},
            {1, 2}
        };
        
        int id = 0;
        int level = 1;
        
        List<String> result = watchedVideosByFriends.watchedVideosByFriends(watchedVideos, friends, id, level);
        
        System.out.println("Videos watched by friends at level " + level + ": " + result);
    }
}