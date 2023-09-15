package md.tekwillacademy.gitworkflow;

public class GitWorkFlow {

    public String[] steps;

    public void ReadSteps(String[] steps)
    {
        this.steps = steps;
        for (String step : steps){
            System.out.println(step);
        }
    }
    public static void main(String[] args) {

        String step1 = "Execute git stash in the console";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Execute git fetch command - to see if there are any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin/master to local master";
        String step5 = "Execute git branch New_Branch_Name command to create a new branch that is same as local master";
        String step6 = "Perform git checkout New_Branch_Name - as result we are redirected to the newly created branch";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command from the IntelliJ IDEA to store the changes at a local level - on the current branch";
        String step9 = "Execute git push from IntelliJ IDEA panel - as result, a new remote branch is created with origin/New_Branch_Name";
        String step10 = "Create a pull request from Origin/New_Branch_Name into master";
        String step11 = "Add the Pull Request details like name, description and reviewers";
        String step12 = "If we collect at least 1 approval then we can merge the changes and continue with another task";
        String step13 = "Do not forget that locally you are still on the New_Branch_Name.";

        String[] steps = {step1, step2, step3, step4, step5, step6, step7, step8, step9, step10, step11, step12, step13};
        GitWorkFlow myObj = new GitWorkFlow();
        myObj.ReadSteps(steps);

    }
}
