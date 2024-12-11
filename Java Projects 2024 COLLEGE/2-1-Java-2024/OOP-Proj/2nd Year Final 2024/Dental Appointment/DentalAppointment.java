import java.time.LocalDate;

abstract class DentalService {
    private String appointmentType;
    private String patientName;
    private LocalDate appointmentDate;

    public DentalService(String appointmentType, String patientName, LocalDate appointmentDate) {
        this.appointmentType = appointmentType;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientName() {
        return patientName;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public abstract void performService();
}

class Consultation extends DentalService {
    private String doctorName;
    private String reasonForVisit;

    public Consultation(String patientName, LocalDate appointmentDate, String doctorName, String reasonForVisit) {
        super("Consultation", patientName, appointmentDate);
        this.doctorName = doctorName;
        this.reasonForVisit = reasonForVisit;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    @Override
    public void performService() {
        System.out.println("Consultation Appointment Details");
        System.out.println("Appointment Type: " + getAppointmentType());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Appointment Date: " + getAppointmentDate());
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Reason for Visit: " + reasonForVisit);
        System.out.println("Performing a general consultation for " + getPatientName() + " with " + doctorName);
    }
}

class Orthodontics extends DentalService {
    private String treatmentPlan;
    private int treatmentDuration;

    public Orthodontics(String patientName, LocalDate appointmentDate, String treatmentPlan, int treatmentDuration) {
        super("Orthodontics", patientName, appointmentDate);
        this.treatmentPlan = treatmentPlan;
        this.treatmentDuration = treatmentDuration;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public int getTreatmentDuration() {
        return treatmentDuration;
    }

    @Override
    public void performService() {
        System.out.println("Orthodontics Appointment Details");
        System.out.println("Appointment Type: " + getAppointmentType());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Appointment Date: " + getAppointmentDate());
        System.out.println("Treatment Plan: " + treatmentPlan);
        System.out.println("Treatment Duration: " + treatmentDuration + " months");
        System.out.println("Performing orthodontic treatment for " + getPatientName() + " with treatment plan: " + treatmentPlan);
    }
}

public class DentalAppointment {
    public static void main(String[] args) {
        DentalService consultation = new Consultation("John Doe", LocalDate.of(2024, 12, 12), "Dr. Smith", "Toothache");
        DentalService orthodontics = new Orthodontics("Jane Doe", LocalDate.of(2024, 12, 15), "Braces Installation", 12);

        consultation.performService();
        System.out.println();
        orthodontics.performService();
    }
}
