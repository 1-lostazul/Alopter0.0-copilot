#!/usr/bin/env bash
# Create suggested labels for the repository using gh CLI
set -e
REPO="1-lostazul/Alopter0.0-copilot"

declare -A labels=(
  [bug]=d73a4a
  [enhancement]=a2eeef
  [design]=c2e0c6
  [docs]=0e8a16
  [infra]=fbca04
  [security]=e6b8b7
  [blocked]=000000
  ["help wanted"]=008672
)

for name in "${!labels[@]}"; do
  color=${labels[$name]}
  echo "Creating label: $name ($color)"
  gh label create "$name" --color "$color" --repo "$REPO" || echo "Label $name may already exist"
done
