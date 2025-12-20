package com.practice.lld.stateDesignPattern.atmSystemDesign;

public enum GameType {
    COMPUTER("Single_player_game"), MULTI_PLAYER("Multi_player_game");
    private final String desc;

    /**
     *   Learning:
     *   1. Enum is a special typ of classes
     *   2. used to represent set of constants which serves the common problem
     *   3. provide a way to create singleton bean/object
     *   4. immutable way of creating an object
     *   5. scope = singleton
     *   6. Enum value should be intialized at the time of instantiation only
     *
     *
     */
    GameType(String desc) {
        this.desc = desc;
    }

    public String getGameType() {
        return this.desc;
    }


}
