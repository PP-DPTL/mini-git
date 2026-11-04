# mini-git

## Setup

### Install "mise"
- On windows open powershell and use "winget install jdx.mise".
- On MacOs use "curl -fsSL https://mise.run | sh" (written by non mac user so results may vary)

### Using mise in the project
When mise has been successfully installed it is easy to use. for the setup use these commands:
- mise trust (this trusts any configs that we have, just in case)
- mise install (installs all tools and dependencies)
- mise -- mvn --version (small test to ensure the installation worked succesfully, should just return a maven version)

When those commands are done you can use mise in the project henceforth. Now you will most likely only use "mise run (placeholder)". to see all runnable tasks use **mise task ls**. 

The current tasks are as follows:
- **mise run build**, runs main and builds the project, and also runs test
- **mise run test**, runs all the tests, in the test folder

If your Ide for some reason needs to know where the java jdk is located you can use the command **mise where java**, and I assume this would work with other languages also if you use python for example.

### Advanced Mise
It is possible to use the command **mise watch --glob "**/*.java" test**(look at this one not in preview, it is messed up because of markdown). This command will keep the tests running as you edit, so you should get a live preview of the test results as you are working 