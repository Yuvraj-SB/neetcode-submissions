class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        int n = intervals.size();
        if (n == 0) return 0;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0;
        int e = 0;
        int rooms = 0;
        int maxRooms = 0;

        while (s < n) {

            if (start[s] < end[e]) {
                rooms++;
                s++;
            } else {
                rooms--;
                e++;
            }

            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
}