# MVP + Monetization Implementation

## Scope implemented in repository
- MVP onboarding flow in Android app scaffold.
- App positioning and market validation document.
- Play Store launch and release checklist.

## MVP build direction (Android Studio + Kotlin)
- Keep MVP focused on:
  - onboarding
  - simple ask/answer flow
  - permission transparency
- Defer advanced automation until after stability and trust metrics are healthy.

## Free-tier backend/services guidance
- Use Firebase free tier only if needed for:
  - analytics events
  - crash reporting
  - cloud messaging
- Keep API keys and secrets out of the repository.

## Primary monetization model
- **Primary model:** ad-supported free app.
- First release target:
  - non-intrusive placement (home screen or results screen)
  - avoid onboarding interruption with ads
  - monitor retention impact before increasing ad frequency

## Play Store assets to prepare
- App name + short description + full description
- At least 4 phone screenshots
- Feature graphic
- Privacy policy URL
- Data safety answers
- Content rating questionnaire answers

## Release pipeline
1. Internal test
2. Closed testing
3. Crash/ANR cleanup
4. Production rollout (staged)

## Post-launch optimization
- ASO iteration cadence: every 2–4 weeks.
- Growth testing:
  - paywall timing (if premium layer is added later)
  - ad placement experiments
  - country-specific monetization tuning by CPM and retention
