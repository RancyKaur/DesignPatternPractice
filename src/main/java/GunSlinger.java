class GunSlinger {
    public GunSlinger(String newName) {
        name = newName;
    }

    public String getState() {
        return state;
    }

    private void setState(String newState) {
        if (state != "Dead")
            state = newState;
    }

    private void shot() {
        setState("Dead");
        target = null;
    }

    public void shootCommand() {
        setState("Shooting");
        if (this.target != null)
            target.shot();
    }

    public void blinkCommand() {
        setState("Blinking");
    }

    public void setTargetCommand(GunSlinger newTarget) {
        if (state != "Dead") {
            target = newTarget;
            setState("Duel");
        }
    }

    private String state;
    GunSlinger target;
    String name;
};
