class User {

    private String firstName;

    private String lastName;

    private Integer age;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
    // Note : No setter fields to enforce immutability

    /**
     * Builder class used to build 'User' object.
     * It is static to access it without instantiating the 'User' class
     */
    public static class UserBuilder {

        private String firstName;

        private String lastName;

        private Integer age;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() throws Exception {
            // Validate the fields before creating the actual class
            validate();
            return new User(this);
        }

        private void validate() throws Exception {
            if (this.age < 0) {
                throw new Exception("Invalid Age");
            }
        }
    }
}
