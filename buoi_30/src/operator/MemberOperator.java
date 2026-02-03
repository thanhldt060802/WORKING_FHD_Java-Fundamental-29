package operator;
import java.util.ArrayList;

import entity.Member;
import entity.Project;

public class MemberOperator implements SimpleOperator<Member> {

    private ProjectOperator po;
    private ArrayList<Member> memberList;

    public MemberOperator() {
        this.memberList = new ArrayList<>();
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public ProjectOperator getPo() {
        return po;
    }

    public void setPo(ProjectOperator po) {
        this.po = po;
    }

    @Override
    public void showAll() {
        for (Member member : this.memberList) {
            System.out.println(member);
        }
    }

    @Override
    public void add(Member member) {
        // for (Member existedMember : this.memberList) {
        //     if (existedMember.getId().equals(member.getId())) {
        //         return;
        //     }
        // }

        // this.memberList.add(member);

        Member foundMember = this.search(member);
        if (foundMember == null) {
            this.memberList.add(member);
        }
    }

    @Override
    public void update(Member member) {
        // for (int i = 0; i < this.memberList.size(); i++) {
        //     if (this.memberList.get(i).getId().equals(member.getId())) {
        //         this.memberList.set(i, member);
        //         return;
        //     }
        // }

        // Không có lớp con
        Member foundMember = this.search(member);
        if (foundMember != null) {
            foundMember.setName(member.getName());
            foundMember.setJobCategory(member.getJobCategory());
        }

        // Có lớp con
        // Member foundMember = this.search(member);
        // if (foundMember != null) {
        //     if (member instanceof A && foundMember instanceof A) {
        //         A castedFoundMember = (A)foundMember;
        //         castedFoundMember.setName(...);
        //         castedFoundMember.setJobCategory(...);
        //         castedFoundMember.setFieldX(...);
        //         castedFoundMember.setFieldY(...);
        //     } else if (member instanceof B && foundMember instanceof B) {
        //         ...
        //     }
        // }
    }

    @Override
    public void remove(Member member) {
        // for (int i = 0; i < this.memberList.size(); i++) {
        //     if (this.memberList.get(i).getId().equals(member.getId())) {
        //         this.memberList.remove(i);
        //         return;
        //     }
        // }

        Member foundMember = this.search(member);
        if (foundMember != null) {
            this.memberList.remove(foundMember);
        }
    }

    @Override
    public Member search(Member member) {
        for (Member existedMember : this.memberList) {
            if (existedMember.getId().equals(member.getId())) {
                return existedMember;
            }
        }

        return null;
    }

    public ArrayList<Member> getMemberListWithNumberOfProjectsInRange(int min, int max) {
        ArrayList<Member> result = new ArrayList<>();
        for (Member member : this.memberList) {
            int count = 0;
            for (Project project : this.po.getProjectList()) {
                for (Member inProjectMember : project.getMemberList()) {
                    if (inProjectMember.getId().equals(member.getId())) {
                        count++;
                    }
                }
            }
            if (count > min && count < max) {
                result.add(member);
            }
        }

        return result;
    }
    
}
