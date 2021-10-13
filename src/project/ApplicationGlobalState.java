package project;

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private static String selectedCity = null;
    private final String API_KEY = "UJYFjY4GDmHsSxOvstykeshXMJ6GMdOD";

    private ApplicationGlobalState() {
    }

    // Непотокобезопасный код для упрощения
    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }

    public static String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}

