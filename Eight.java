interface HOR{
    String getPartyName();
    String getPartyChairman();
}

interface Seats{
    int getNoOfSeats();
}

class Party implements HOR, Seats{
    String politicalParty, partyChairman;
    int noOfSeats;
    Party(String party, String chairman, int seats){
        politicalParty = party;
        partyChairman = chairman;
        noOfSeats = seats;
    }
    @Override
    public String getPartyName() {
        return politicalParty;
    }

    @Override
    public String getPartyChairman() {
        return partyChairman;
    }

    @Override
    public int getNoOfSeats() {
        return noOfSeats;
    }
}

class Eight{
    public static void main(String[] args){
        Party CPNMaoist = new Party("CPM (Maoist Center)", "Puspa Kamal Dahal(Prachanda)",32);
        Party Congress = new Party("Nepali Congress", "Sher Bahadur Deuba",88);
        Party CPNUML = new Party("CPM (UML)", "K.P. Sharma Oli",76);

        System.out.println(CPNMaoist.getPartyName());
        System.out.println(CPNMaoist.getPartyChairman());
        System.out.println(CPNMaoist.getNoOfSeats()+"\n");

        System.out.println(Congress.getPartyName());
        System.out.println(Congress.getPartyChairman());
        System.out.println(Congress.getNoOfSeats()+"\n");

        System.out.println(CPNUML.getPartyName());
        System.out.println(CPNUML.getPartyChairman());
        System.out.println(CPNUML.getNoOfSeats());
    }
}