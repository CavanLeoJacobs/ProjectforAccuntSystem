package za.ac.nwu.ac.domain.service;

import java.io.Serializable;
import java.util.Objects;

    public class GeneralResponse <T> implements Serializable
    {

        private static final long serialVersionUID = -2109552313657529496L;



         private final boolean successful;
        private final transient T payload;
        public GeneralResponse()
        {

        }
        public GeneralResponse(boolean successful,T payload)
        {
            this.successful = successful;
            this.payload= payload;
        }

        public boolean isSuccessful()
        {
            return successful;
        }
        public T getPayload()
        {return payload;}

        @Override
        public boolean equals(Object O) {
            if (this == O) return true;
            if (O==null || getClass() != O.getClass()) return false;
            za.ac.nwu.ac.domain.service.GeneralResponse<?> that = (za.ac.nwu.ac.domain.service.GeneralResponse<?>) O;
            return successful == that.successful && Objects.equals(payload,that.payload);
        }
        //@Override
        public int hashCode(){return Objects.hash(successful,payload);}

        @Override
        public String toString(){return "GeneralResponse{"+
                "successful="+successful
                + "payload="+payload+'}';

        }



    }



