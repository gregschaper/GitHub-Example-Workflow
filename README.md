# GitHub Team Work Flow - CSCI 234

* One team member has been invited to be a collaborator for the GitHub-Example-Workflow repository in the gregschaper GitHub account.

* That team member will check their email for the invite and accept the invitation.

* That team member will fork the GitHub-Example-Workflow repository from the GitHub gregschaper account.

* The team member that forked the repository needs to add all the members of the team as contributors using their Moravian email address to invite them.
	* select the forked repository
	* select the Setting button
	* on the left hand side of the window is an option for Collaborators. Use this feature to add each team member to be a collaborator of your forked repository using their email address to invite them.
	* Each team member accepts the invite.
* Each team member will clone the repository to their local machine.
	* lookup the account of the team member that forked the repository
	* choose The repository
	* select the Code button (should be green)
	* copy the repositories GitHub URL
	* on your local machine create a directory to put the cloned repository
	* open a terminal in that directory and execute:
		* git clone <paste URL here>
	* This should create a new git directory that will have the contents of the forked repository.

* The team member that forked the repository will add code for the Team class and add their name as a team member. Then they will push the resulting Java code files back to the forked repository.
	* to push the code:
		* in the terminal execute the following command for all files you modified:
			* git add <filename>
		* Then execute in the terminal the following command:
			* git commit -m "Put a commit message that is meaningful between the quotes.
		* The execute in the terminal:
			* git push
		* The first time you do this you will need your GitHub account name and GitHub access token

* Each other team member will in turn (one at a time):
	* pull the current version of the repository
		* Execute in the terminal:
			* git pull
	* Modify the code to add their name as a team member
	* Check to see that the project runs on their local machine
	* When correct, push the Java code files back to the repository
		* follow the same steps outlined above for adding, committing, and pushing files to the repository
 
* After all team members have pushed their modified version of the code, each team member will then pull the modified code from the repository and run the Java program to make sure it is working correctly - prints the team name (number) and the names of the members of the team.
	* execute in the terminal:
		git pull

* Fix any problems with the code if it is not working correctly.

* The team member that forked the repository will then issue a pull request from their account to merge the team's code with the upstream repository in the gregschaper account.

* The instructor will accept the merge request for each team.

* The instructor will pull the current version of the program from the repository and run the resulting Java code. All team numbers and members should get displayed to the monitor.

