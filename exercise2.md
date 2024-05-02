# excercise2
***
showcasing the main git commands
| Command | Description | Parameters | Affected Data | Location of Change |
|-|-|-|-|-|
| `git config` | Reads or changes Git configuration settings. | `--global`, `--local`, `--unset`, etc. | Meta-information like username, email address, editor settings | Global, local, or specific to the project |
| `git init` | Initializes a new Git repository in a directory. | None | None | In the current working directory |
| `git commit` | Commits changes in the staging area to a new commit. | `-m`, `--amend`, etc. | Only changes in the staging area | Locally in the Git repository |
| `git status` | Shows the current status of the working directory and the staging area. | None | None | No changes are made, just display |
| `git add` | Adds changes to the staging area. | File paths or wildcards | Only changes in the staging area | Locally in the Git repository |
| `git log` | Displays the commit history. | `--oneline`, `--author`, etc. | None | No changes are made, just display |
| `git diff` | Shows differences between commits, working directory, and staging area. | `--staged`, `--color`, etc. | None | No changes are made, just display |
| `git pull` | Fetches changes from a remote repository and merges them into the local repository. | `--rebase`, `--all`, etc. | Changes from the remote repository | Locally in the working directory and in the repository's branch |
| `git push` | Uploads local commits to a remote repository and synchronizes them. | `--force`, `--all`, etc. | Local commits | In the remote repository and updates the corresponding branch there |
