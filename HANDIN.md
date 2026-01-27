# HANDIN — Team Workflow with Git & GitHub

## Repository
https://github.com/taltech-vanemarendajaks/team-33-borsibaar

---

## Team Members
- Alexandros Krenštrauch (@alexxkr1)
- Gerlin Vainomäe (@gerlinv)
- Aksel Randlepp (@nirney)
- Ellen-Alice Lyakh (@Ellen-Alice)
- Anna Carina Pärnala (@annacarinav)

---

## Pull Requests
- PR #1 — Refactor validation and business rules  
  https://github.com/taltech-vanemarendajaks/team-33-borsibaar/pull/1

- PR #2 — Health check feature  
  https://github.com/taltech-vanemarendajaks/team-33-borsibaar/pull/2

- PR #3 — Springdoc integration  
  https://github.com/taltech-vanemarendajaks/team-33-borsibaar/pull/3

- PR #4 — DTO validation fixes  
  https://github.com/taltech-vanemarendajaks/team-33-borsibaar/pull/4

- PR #5 — Update TEAM.md (merge strategies documentation)  
  https://github.com/taltech-vanemarendajaks/team-33-borsibaar/pull/5

---

## Merge Conflict
A merge conflict occurred when two feature branches modified the same section of the same file.

- Affected pull request: PR #2  
- File: `backend/pom.xml`  
- Reason: parallel changes made in the same part of the file in different feature branches  
- Resolution: the conflict was resolved locally using Git command line tools by manually reviewing and combining the changes into a consistent final version, followed by a commit with the conflict resolution.

---

## Merge Strategies
During the team workflow, different merge strategies were used and discussed.

- **Create a merge commit**  
  Used when merging feature branches into the `dev` branch in order to preserve the full commit history of the feature development (e.g. PR #2).

- **Squash merge / Rebase merge**  
  These strategies were discussed and documented in `TEAM.md` as preferred options for merging into `main`, to keep the commit history concise and readable.

At the time of writing this document, merge strategies have been applied primarily when merging feature branches into `dev`.  
The team is discussing whether to additionally demonstrate different merge strategies explicitly when merging changes into `main`, in order to fully align with the homework requirements.

---

## Team Contributions
- @gerlinv — Health check feature (PR #2)
- @annacarinav — Springdoc integration (PR #3)
- @nirney — DTO validation fixes (PR #4)
- @alexxkr1 — Validation and business rules refactor (PR #1)
- @Ellen-Alice — Team workflow and merge strategy documentation (PR #5)

---

## Submission Method
This assignment is submitted using repository and pull request links, as allowed by the homework instructions.
