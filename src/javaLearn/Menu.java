package javaLearn;

enum Menu {
    SMALL("Small Size"), 
    MEDIUM("Medium Size"), 
    LARGE("Large Size"), 
    EXTRALARGE("Extra Large Size");
	
	private String description;

    // Constructor accepting a String parameter
    Menu(String description) {
        this.description = description;
    }

    // Getter method to retrieve the description
    public String getDescription() {
        return description;
    }
}
