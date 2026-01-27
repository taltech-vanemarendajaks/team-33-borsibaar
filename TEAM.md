Team Overview: TEAM-33
Members: @alexxkr1, @ellen-alice, @gerlinv, @annacarinav, @nirney

Primary Branches: main (production) and dev (integration)

Team Workflow:

Feature Isolation: All new work starts in a dedicated feature branch.

Development Integration: Feature branches are merged into the dev branch first for testing.

Peer Review: Every Pull Request requires a thorough review and approval from team members before merging.

Production Release: Once the dev branch is stable and verified, it is merged into the main branch.

Merge strategies used: merge, rebase and squash
Reason for rebase: adding Spring Doc to the project could be added in a linear manner, no separate commits needed
Reason for Squash: Health Check branch had couple of fix commits that are not necessary
