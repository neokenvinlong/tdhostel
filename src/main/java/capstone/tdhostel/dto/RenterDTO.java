package capstone.tdhostel.dto;

import capstone.tdhostel.model.Booking;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class RenterDTO implements Serializable {
    private int renterId;

    private String renterName;

    private String phoneNumber;

    private String email;

    private String avatar;

    private String password;
}
