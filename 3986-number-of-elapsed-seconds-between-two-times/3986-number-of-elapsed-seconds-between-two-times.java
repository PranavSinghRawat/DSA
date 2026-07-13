class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start=startTime.split(":");
        String[] end=endTime.split(":");

        int sh = Integer.parseInt(start[0]);
        int sm = Integer.parseInt(start[1]);
        int ss = Integer.parseInt(start[2]);

        int eh = Integer.parseInt(end[0]);
        int em = Integer.parseInt(end[1]);
        int es = Integer.parseInt(end[2]);
        int startSeconds = sh * 3600 + sm * 60 + ss;
        int endSeconds = eh * 3600 + em * 60 + es;

        return endSeconds - startSeconds ;
    }
}