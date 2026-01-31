class Activity {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

class FinishTimeComparator implements Comparator<Activity>{
    public int compare(Activity a1, Activity a2) {
        return Integer.compare(a1.finish, a2.finish);
    }
}

class Solution {
    public int overlap(List<Activity> act) {
        Collections.sort(act, new FinishTimeComparator());
        int count = 1;

        Activity lastSelected = act.get(0);
        for(int i=1; i<act.size(); i++) {
            Activity current = act.get(i);
            if(lastSelected.finish <= current.start) {
                lastSelected = current;
                count++;
            }
        }
        return act.size() - count;
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        List<Activity> activities = new ArrayList<>();
        int n = intervals.length;
        int m = intervals[0].length;
        for(int i=0; i<n; i++) {
            int j=0;
            activities.add(new Activity(intervals[i][j], intervals[i][j+1]));
        }
        
        return overlap(activities);

    }
}