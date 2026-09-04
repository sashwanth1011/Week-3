class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    // Constructor to initialize all fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Method to print formatted line
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        // Creating an array of PlacementRecord objects
        PlacementRecord[] records = new PlacementRecord[] {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        // Iterating and printing each record
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}