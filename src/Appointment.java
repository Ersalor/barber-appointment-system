import java.util.List;
import java.time.LocalDateTime;
public class Appointment {
    private Long id;
    private User customer;
    private List<AppointmentItem> items;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer totalPrice;
    private AppointmentStatus status;

}
