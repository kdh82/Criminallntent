package kr.or.dgit.criminallntent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    /*private String mDate;*/
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

  /*  public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String losdf = sdf.format(new Date());
        String[] weeks = {"일요일" ,"월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        Calendar cal = Calendar.getInstance();
        String dayOfWeek = weeks[cal.get(Calendar.DAY_OF_WEEK)-1];
        String mDate = losdf+" "+dayOfWeek;

        return mDate;
    }*/

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
