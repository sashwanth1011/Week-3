class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        // Step 1: Create initial object
        IdCard ravi = new IdCard("Ravi", 0);

        // Step 2: Reference copy
        IdCard duplicate = ravi;

        // Step 3: Modify through the second reference
        duplicate.booksIssued = 3;

        // Step 4: Access field via first reference and compare identity
        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        // Step 5: Create a separate object with identical values
        IdCard separate = new IdCard("Ravi", 3);
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}