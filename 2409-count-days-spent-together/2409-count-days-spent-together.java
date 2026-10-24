class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = {0, 31, 59, 90, 120, 151,181, 212, 243, 273, 304, 334};
        String [] aAlice = arriveAlice.split("-");
        String [] lAlice = leaveAlice.split("-");
        String [] abob = arriveBob.split("-");
        String [] lbob = leaveBob.split("-");

        int aAlicemonth = Integer.parseInt(aAlice[0]);
        int aAlicedate = Integer.parseInt(aAlice[1]);
        int lAlicemonth = Integer.parseInt(lAlice[0]);
        int lAlicedate = Integer.parseInt(lAlice[1]);

        int aBobmonth = Integer.parseInt(abob[0]);
        int aBobdate = Integer.parseInt(abob[1]);
        int lBobmonth = Integer.parseInt(lbob[0]);
        int lBobdate = Integer.parseInt(lbob[1]);

        if(aBobmonth > lAlicemonth || lBobmonth < aAlicemonth ) return 0;
        int time = 0;
        int aAlicetime = days[aAlicemonth-1] + aAlicedate;
        int lAlicetime = days[lAlicemonth-1] + lAlicedate;
        int aBobtime = days[aBobmonth-1] + aBobdate;
        int lBobtime = days[lBobmonth-1] + lBobdate;

        int start = Math.max(aAlicetime, aBobtime);
        int end = Math.min(lAlicetime, lBobtime);
        return Math.max(0, end - start + 1);
    }
}