package za.ac.nwu.ac.domain.service;

import java.io.Serializable;
import java.util.Objects;

public class GeneralResponse <T> implements Serializable {

    private static final long serialVersionUID = 7902737205491303657L;


    private final String MemberView;



    public GeneralResponse(String MemberView) {

        this.MemberView = MemberView;
    }



    public String MemberView()
    {
        return MemberView;
    }

    @Override
    public boolean equals(Object O) {

        if (this == O) return true;
        if (O==null || getClass() != O.getClass()) return false;
        GeneralResponse<?> that = (GeneralResponse<?>) O;
        return Objects.equals(MemberView,that.MemberView); //&& ViewedSuccessful == that.ViewedSuccessful ;
    }


}



