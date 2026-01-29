public class AppointmentItem {
    private Long id;
    private Appointment appointment;
    private Service service;
    private Integer priceAtAppointment;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setService(Service service) {
        this.service = service;
        if(service != null){
            this.priceAtAppointment =getService().getPrice();
        }
    }

    public Service getService() {
        return service;
    }

//    public void setPriceAtAppointment(Integer priceAtAppointment) {
//        this.priceAtAppointment = priceAtAppointment;
//    } Buna ihtiyacımız yok şuan,setService methodunda otomatikleştirdik

    public Integer getPriceAtAppointment() {
        return priceAtAppointment;
    }
}
