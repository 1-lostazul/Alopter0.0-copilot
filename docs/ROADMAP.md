# Roadmap for Alopter0.0-copilot (AIopter)

This roadmap is a living document describing the initial milestones derived from the product build specification.

Milestones

- M1 — Project scaffolding & contributor setup (DONE)
  - Repo scaffolding
  - CONTRIBUTING, CODE_OF_CONDUCT, SECURITY, SUPPORT
  - CI and dependabot

- M2 — Floating bubble prototype & permission flows
  - Design overlay UX
  - Implement overlay permission onboarding
  - Persistent notification

- M3 — Explicit screen capture & analysis
  - Implement MediaProjection-based capture flow
  - Visible active indicator and foreground service
  - Local OCR pipeline (Tesseract or ML Kit) proof of concept

- M4 — Backend & model proxy
  - Replit-hosted backend with Replit Auth or Clerk
  - Server-side AI proxying (no client API keys)
  - Conversation storage and basic QA

- M5 — Voice, privacy audit, and Play Store prep
  - Voice input and transcription
  - Privacy redaction heuristics
  - Debug APK and release AAB

How to use this roadmap

- Open issues should reference a milestone (M1..M5) and the board will track progress.
- When adding work, prefer small, reviewable PRs that implement one task at a time.
