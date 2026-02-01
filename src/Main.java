import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args){

        User user = new User();

        user.setId(1L);
        user.setName("Mehmet Zeki");
        user.setSurname("Şanlı");
        user.setPhone("0531 424 89 34");
        user.setRole(Role.CUSTOMER);
       // System.out.println(user.toString());

        Service sac = new Service();
        sac.setId(1L);
        sac.setName("Saç Traşı");
        sac.setDuration(40);
        sac.setPrice(450);
       // System.out.println(sac.toString());

        Service sakal = new Service();
        sakal.setId(2L);
        sakal.setName("Sakal Traşı");
        sakal.setDuration(20);
        sakal.setPrice(200);
      //  System.out.println(sakal.toString());

        //Appointment starts here
        Appointment appointment = new Appointment();
        appointment.setId(1L);
        appointment.setCustomer(user);
        appointment.setStartTime(LocalDateTime.of(2026, 1, 2, 15, 0));

        AppointmentItem appointmentItem = new AppointmentItem();
        appointmentItem.setId(1L);
        appointmentItem.setAppointment(appointment);
        appointmentItem.setService(sac);
      //  System.out.println(appointmentItem.toString());

        AppointmentItem appointmentItem1 = new AppointmentItem();
        appointmentItem1.setId(2L);
        appointmentItem1.setAppointment(appointment);
        appointmentItem1.setService(sakal);
       // System.out.println(appointmentItem1.toString());

        //Appointment ends here
        appointment.setItems(List.of(appointmentItem,appointmentItem1));
        appointment.calculateTotals();
        System.out.println(appointment.toString());
    }
}
