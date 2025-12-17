class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }
        else{
            return 6;
        }
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    public String toString(){
        return "Fighter is a Wizard";
    }
    private boolean spellPrepared;
    boolean isVulnerable(){
        return !spellPrepared;
    }
    void prepareSpell(){
        spellPrepared = true;
    }
    int getDamagePoints(Fighter fighter){
        if(spellPrepared){
            return 12;
        }
        else{
            return 3;
        }
    }
}