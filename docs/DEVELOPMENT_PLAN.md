# Development Plan — AIopter

## Goals (first 3 months)
1. Build floating bubble overlay and persistent notification.
2. Implement compact assistant panel with text input and basic AI request flow.
3. Implement explicit screen capture flow and visible active indicator.
4. Integrate backend auth and model proxy for simple QA.

## Milestones
- M1: Project scaffolding, CI, basic UI, overlay permission flow
- M2: Screen capture consent flow, capture & local OCR pipeline
- M3: Backend auth, proxy to AI model, conversation storage
- M4: Voice input, transcription, and editable transcript
- M5: Privacy audit, redaction heuristics, user settings

## Repo structure
- app/ (Android application)
- backend/ (Replit-hosted server or cloud functions)
- docs/
- src/ (placeholder for early prototypes)

## Testing & QA
- Device matrix for Android versions and OEMs
- Automated unit tests for core logic
- Manual privacy/security checklist

## CI/CD
- Use GitHub Actions for linting and unit tests
- Replit or managed cloud for backend deployment

## Notes
- No API keys in repo
- Accessibility features opt-in and documented
- Provide debug APK and release AAB for Play Store
