package inClassAssignment;

public class StudentRegistration {
        private String name;
        private String address;
        private String phone;
        private String adhar;
        private String parentPhoneNo;

        public StudentRegistration(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public StudentRegistration(String name, String address, String phone, String adhar) {
            this(name, address, phone);
            this.adhar = adhar;
        }

        public StudentRegistration(String name, String address, String phone, String adhar, String parentPhoneNo) {
            this(name, address, phone, adhar);
            this.parentPhoneNo = parentPhoneNo;
        }

        // Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAdhar() {
            return adhar;
        }

        public void setAdhar(String adhar) {
            this.adhar = adhar;
        }

        public String getParentPhoneNo() {
            return parentPhoneNo;
        }

        public void setParentPhoneNo(String parentPhoneNo) {
            this.parentPhoneNo = parentPhoneNo;
        }


    public static void main(String[] args) {
        StudentRegistration student1 = new StudentRegistration("John Doe", "123 Main St", "1234567890");
        StudentRegistration student2 = new StudentRegistration("Jane Smith", "456 Elm St", "9876543210", "123456789");
        StudentRegistration student3 = new StudentRegistration("Alice Johnson", "789 Oak St", "5555555555", "987654321", "1111111111");

    }
}
