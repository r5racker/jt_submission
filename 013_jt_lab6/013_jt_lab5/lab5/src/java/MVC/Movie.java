/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.*;

/**
 *
 * @author user1
 */
public class Movie {
    int mId;
    String mName;
    ArrayList<String> mGenres;
    int mReleaseYear;

    public Movie(int mId, String mName, ArrayList<String> mGenres, int mReleaseYear) {
        this.mId = mId;
        this.mName = mName;
        this.mGenres = mGenres;
        this.mReleaseYear = mReleaseYear;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmReleaseYear(int mReleaseYear) {
        this.mReleaseYear = mReleaseYear;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public int getmReleaseYear() {
        return mReleaseYear;
    }
    
    public String getmNameIfGenreMatches(String genre){
        if(this.mGenres.contains(genre)==true){
            return(this.mName);
        }
        else{
            return(null);
        }
    }
}
