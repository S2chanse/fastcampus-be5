package me.day09.exception_practice.practice05;

public class Members extends DArray<Member> {
    /////////////////////////////////////////
    // singleton
    private static Members allMembers;

    public static Members getInstance() {
        if (allMembers == null) {
            allMembers = new Members();
        }
        return allMembers;
    }
    /////////////////////////////////////////

    public void init() { // Members 초기화
        for (int i = 0; i < 10; i++) {
            allMembers.add(new Member(
                    Character.toString('a' + i),
                    Character.toString('a' + i) + "1234"
            ));
        }
    }

}
