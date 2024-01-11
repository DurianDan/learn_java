package mypack;

public class EmployeePosition {
    public static class Developer extends Employee{
        public Developer(
            int age,
            String name,
            float seniority
        ) {
            super(age, name, seniority);
        }

        @Override
        public String getPosition() {
            return "Developer";
        }
    }
    public static class TechLead extends Employee{
        public TechLead(
            int age,
            String name,
            float seniority
            ) {
                super(age, name, seniority);
            }
            
        @Override
        public String getPosition() {
            return "Tech Lead";
        }
    }
}
