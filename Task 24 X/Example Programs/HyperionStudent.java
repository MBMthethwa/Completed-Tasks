
public class HyperionStudent {
    /*
     Thousands of Hyperion students across South Africa
     learn basic and advanced programming on our courses.
     */

    String passion, education, commitment;

    public HyperionStudent(String passion, String education, String commitment) {
        /*
         Hyperion students are passionate, educated, and committed.
         */
        this.passion = passion;
        this.education = education;
        this.commitment = commitment;
    }

    public void register() {
        if (this.education.equals("beginner")) {
            System.out.println("Never programmed before? Not a problem. We have courses for you.");
        } else if (this.education.equals("intermediate")) {
            System.out.println("Know a language already? We'll take you further.");
        } else if (this.education.equals("advanced")) {
            System.out.println("Coming top in your Computer Science courses?"
                    + "We'll challenge you with courses in Artificial Intelligence.");
        }
    }

    public void refer_student() {
        System.out.println(" Excel on our courses and get referred for full time or internship software development roles with local South African companies that parter with Hyperion. ");
    }
}
