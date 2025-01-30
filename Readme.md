# Git Workflow Explanation

This document explains the sequence of commands used in a Git workflow. Each command is followed by a comment explaining its purpose.

---

```bash
# Create a directory named 'dsa' and navigate into it
mkdir dsa
cd dsa/

# Initialize a new Git repository in the current directory
git init

# Create an empty file named 'Readme.md'
touch Readme.md

# Check the status of the working directory and staging area
git status

# Add 'Readme.md' to the staging area to prepare it for a commit
git add Readme.md

# Commit the staged changes with a message "Empty File"
git commit -m "Empty File"

# Open 'Readme.md' in the 'vi' editor to make changes
vi Readme.md

# Check the status after editing the file
git status

# Add all changes in the working directory to the staging area
git add .

# Commit the changes with a message "The file has now my name in it"
git commit -m "The file has now my name in it"

# Remove 'Readme.md' from the working directory
rm Readme.md

# Check the status after deleting the file
git status

# Add the deletion to the staging area
git add .

# Commit the deletion with a message "The file is now deleted"
git commit -m "The file is now deleted"

# View the commit history
git log

# Reset the repository to a specific commit (replace hash with actual commit hash)
git reset 71f9b8096d750408fc13a4868be70966ebaa4168

# Stash any uncommitted changes temporarily
git stash

# Add a remote repository named 'origin' with the GitHub URL
git remote add origin https://github.com/Muneebdev1/DSA-JAVA.git

# Verify the remote repository URL
git remote -v

# Push the local 'master' branch to the remote 'origin' repository
git push origin master