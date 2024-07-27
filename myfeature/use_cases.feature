Feature: login

Scenario: valid loginn
Given Iam not in system
When Set username "nao"and pass "123"
Then login succeed
