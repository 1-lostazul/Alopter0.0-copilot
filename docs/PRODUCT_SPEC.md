# Product Specification — AIopter

## Overview
AIopter is a permission-first, floating AI assistant for Android that hovers above other apps and helps users via voice or text. It provides explicit, user-initiated screen analysis, short helpful answers, and strong privacy controls.

## Platform
- Android (Kotlin, Jetpack Compose, Material 3)
- Target modern Android SDK versions

## Core features
- Floating draggable bubble overlay
- Compact assistant panel with text and voice input
- Explicit screen-capture on user request
- Conversation history and basic search
- Quick Kill and verbal stop command
- Permission-based allowed/never-allow app lists

## Required states
Ready, Listening, Capturing screen, Analyzing, Responding, Permission required, Screen analysis unavailable

## Permissions & privacy
- Overlay permission explained in onboarding
- Screen capture only with explicit consent and visible indicator
- Microphone permission requested on use
- Accessibility only optional and opt-in with clear explanation

## Backend
- Auth (Clerk or Replit Auth)
- Conversation storage
- Model proxying (no client API keys)
- Rate limiting, health check, privacy-safe logging

## MVP scope
Prioritize: explain visible content, summarize, extract text, translate, answer questions about screen, read aloud, draft a reply, copy extracted text.

## Out of scope for MVP
- Continuous screen recording
- Deep automation without explicit consent
- iOS (first release Android-only)
