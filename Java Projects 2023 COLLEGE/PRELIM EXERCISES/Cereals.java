public enum Cereals {
    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(70),
    REESES_PUFFS(100),
    COCOA_PUFFS(10);

    private final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

    public int getLevelOfDeliciousness() {
        return levelOfDeliciousness;
    }
}

/*public enum Cereals {
    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(70),
    REESES_PUFFS(100),
    COCOA_PUFFS(10);

    final int levelOfDeliciousness;

    Cereals (int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}*/
