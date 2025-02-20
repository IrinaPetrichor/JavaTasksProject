package tasks;

enum Error {
    ERROR_OUT_OF_SCOPE("ERROR: This input is not within the task's requirements."),
    ERROR_INVALID("ERROR: Invalid input."),
    ERROR_OUT_OF_INT("ERROR: The result is out of (int) type limit");

    private final String error;

    Error(String error) {
        this.error = error;
    }

    public String get() {
        return error;
    }
}