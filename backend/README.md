# Backend skeleton — AIopter

This folder contains a minimal Node/Express backend skeleton intended for local development or deployment to Replit.

Endpoints
- GET /health — health check
- POST /auth — placeholder for auth integration (Replit Auth / Clerk)
- GET /conversations — list conversations (placeholder)
- POST /conversations — create conversation (placeholder)
- POST /conversations/:id/messages — send message (placeholder)
- POST /analyze — analyze submitted screen content (placeholder)

How to run locally
1. cd backend
2. npm install
3. npm start

Important
- Do not include secret API keys in the repository.
- Integrate a managed auth provider (Replit Auth, Clerk, etc.) before accepting real user data.
