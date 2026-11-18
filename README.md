# mini-git

## Setup

### Install "mise"
- On windows open powershell and use "winget install jdx.mise".
- On MacOs use "curl -fsSL https://mise.run | sh" (written by non mac user so results may vary)

### Using mise in the project
When mise has been successfully installed it is easy to use. for the setup use these commands:
- **mise trust** (this trusts any configs that we have, just in case)
- **mise install** (installs all tools and dependencies)
- **mise -- mvn --version** (small test to ensure the installation worked succesfully, should just return a maven version)

When those commands are done you can use mise in the project henceforth. Now you will most likely only use "mise run (placeholder)". to see all runnable tasks use **mise task ls**. 

The current tasks are as follows:
- **mise run build**, runs main and builds the project, and also runs test
- **mise run test**, runs all the tests, in the test folder

If your Ide for some reason needs to know where the java jdk is located you can use the command **mise where java**, and I assume this would work with other languages also if you use python for example.

### Advanced Mise
It is possible to use the command **mise watch --glob "**/*.java" test**(look at this one not in preview, it is messed up because of markdown). This command will keep the tests running as you edit, so you should get a live preview of the test results as you are working 

## Project description
MVP is to do this first:

The question. What does a data structure buy when no operation ever overwrites, and what does it cost? Git keeps every version of a project because stored data is never overwritten: a commit adds new immutable objects and reuses the unchanged ones, and a branch is only a name for a commit. The project builds that design on a persistent map. The decision is state: ephemeral or persistent, with sharing between versions as the consequence of never mutating.

The core. A small repository on a persistent map.

A balanced persistent map (AVL or red-black) from paths to contents, behind an abstract signature, with its laws as tests on random sequences of operations.
A repository on the map: a commit is a new root, a branch is a name for a root, checkout selects a branch, and a log lists the commits.
A diff that stops at the subtrees two versions share (the same node in memory, not merely equal).
Evidence: on a generated history of a thousand commits, the memory held by all the versions against one full copy per commit, and the number of nodes the diff visits, in one table that the report explains.


This is extra
Directions chosen A real history replayed from git, a three-way merge