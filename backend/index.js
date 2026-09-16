// Simple Express backend skeleton for AIopter

const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = process.env.PORT || 3000;

app.use(bodyParser.json());

// Health check
app.get('/health', (req, res) => {
  res.json({ status: 'ok' });
});

// Auth placeholder - integrate Replit Auth or Clerk as needed
app.post('/auth', (req, res) => {
  res.status(501).json({ error: 'Auth not implemented. Integrate Replit Auth, Clerk, or your preferred provider.' });
});

// Conversations placeholder
app.get('/conversations', (req, res) => {
  res.json({ conversations: [] });
});

app.post('/conversations', (req, res) => {
  // Create a conversation (placeholder)
  res.status(201).json({ id: 'conv_1', title: req.body.title || 'New conversation' });
});

// Messages placeholder
app.post('/conversations/:id/messages', (req, res) => {
  // Handle a message send (proxy to model on server)
  res.status(201).json({ id: 'msg_1', content: req.body.content || '', role: 'user' });
});

// Analyze placeholder
app.post('/analyze', (req, res) => {
  // Accepts screen content or OCR results for analysis. Do not accept raw screenshots without explicit consent.
  res.json({ analysis: 'Not implemented. Wire up OCR & model proxy on server.' });
});

app.listen(port, () => {
  console.log(`AIopter backend skeleton listening on port ${port}`);
});
