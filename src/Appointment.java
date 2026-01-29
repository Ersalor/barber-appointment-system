import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Appointment {
    private Long id;
    private User customer;
    private List<AppointmentItem> items  = new ArrayList<>();
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer totalPrice;
    private AppointmentStatus status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getCustomer(){
        return customer;
    }

    public void setItems(List<AppointmentItem> items) {
        this.items = items;
    }

    public List<AppointmentItem> getItems(){
        return items;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void calculateTotals(){
        if (this.items == null || this.items.isEmpty()){
            System.out.println("Hata: Listede hizmet yok,hesaplama yapılamaz.");
            return;
        }
        if(this.startTime == null){
            System.out.println("Hata: Randevu başlangıç saati girilmemiş.");
            return;
        }

        int totalMoney = 0;
        int totalDurationMinutes = 0;

        for (AppointmentItem item : this.items){

            totalMoney += item.getPriceAtAppointment();
            totalDurationMinutes += item.getService().getDuration();

        }
        this.totalPrice = totalMoney;
        this.endTime = this.startTime.plusMinutes(totalDurationMinutes);

        System.out.println("Bitiş saati: " + getEndTime() + " ," + "Toplam : " + getTotalPrice() + "TL");
    }

    public LocalDateTime getEndTime(){
        return endTime;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
}
