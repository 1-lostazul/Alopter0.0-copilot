# Setup and developer notes

This file outlines how to get started with the repository locally and recommended next steps.

Local setup (recommended)
1. Clone the repo: git clone https://github.com/1-lostazul/Alopter0.0-copilot.git
2. Install backend dependencies:
   cd Alopter0.0-copilot/backend
   npm install
3. Start backend (dev):
   npm start

Android app
- The app module is scaffolded under app/ but the Gradle wrapper is not included. Add the Gradle wrapper or use your local Gradle installation to build.

Labels and issue creation
- To create recommended labels run: bash .github/create-labels.sh (requires gh CLI & authentication)

Project board & milestones
- I recommend creating a Project board named "Roadmap" and adding the M1..M5 milestones from docs/ROADMAP.md. You can create them via the GitHub UI or gh commands.

Security & privacy
- Review docs/SECURITY_AND_PRIVACY.md before enabling any screen-capture or accessibility features.

Next steps (proposed)
- Integrate Replit Auth on the backend and secure endpoints
- Implement an overlay permission onboarding flow in the app
- Prototype explicit screen-capture and local OCR
