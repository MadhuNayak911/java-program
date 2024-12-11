class Company01 {
    private String name;

    public static void main(String[] args) {
        Company01 company = new Company01();
        company.setName("ethnus");
        System.out.println(company.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
