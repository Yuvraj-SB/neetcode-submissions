class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];

        for (int i = 0; i < intervals.size(); i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0;
        int e = 0;
        int rooms = 0;
        int maxRooms = 0;

        while (s < intervals.size()) {

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