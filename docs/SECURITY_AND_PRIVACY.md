# Security and Privacy — AIopter

AIopter treats privacy and security as core product requirements.

Principles
- Minimal data collection: only what is required to perform an explicit user request.
- Explicit consent: screen capture and sensitive actions must be initiated by the user.
- Transparency: show clear UI when screen capture or listening is active.
- Local-first: do as much processing on-device as feasible; never embed API keys in the client.
- Redaction: attempt to redact or block passwords, payment data, authentication codes, and banking details from uploads.

Data handling
- Transmit data over HTTPS with strong TLS settings.
- Store only necessary conversation metadata; allow users to delete conversations.
- Use privacy-safe logging; avoid logging sensitive payloads.

Access controls
- Use managed auth (e.g., Clerk or Replit Auth).
- Server-side rate limits and abuse controls.

User controls
- Allowed Apps list and Never Allow list
- Ability to pause/stop overlays and revoke permissions
- Clear kill-switch and verbal stop command

Compliance
- Follow platform policies for Accessibility and Screen Capture
- Provide clear privacy policy in the app and in the repo
