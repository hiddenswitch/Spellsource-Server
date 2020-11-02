create schema if not exists spellsource;

create table spellsource.decks
(
  id text not null unique primary key,
  created_by character varying references keycloak.user_entity (id) not null,
  last_edited_by character varying references keycloak.user_entity (id) not null,
  name character varying,
  hero_class character varying,
  trashed boolean not null default false,
  format text,
  deck_type int not null,
  is_premade boolean not null default false,
  permitted_to_duplicate boolean not null default false
);

create index on spellsource.decks (created_by);
create index on spellsource.decks (is_premade) where decks.is_premade is true;
create index on spellsource.decks (trashed) where decks.is_premade is false;

comment on column spellsource.decks.created_by is 'who created this deck originally';
comment on column spellsource.decks.last_edited_by is 'who last edited this deck';
comment on column spellsource.decks.is_premade is 'premades always shared with all users by application logic';

create table spellsource.cards
(
  id text not null primary key unique,
  created_by character varying references keycloak.user_entity (id) not null,
  uri text null,
  blockly_workspace xml null,
  card_script jsonb null,
  created_at timestamptz not null default now(),
  last_modified timestamptz not null default now()
);

create table spellsource.cards_in_deck
(
  id bigint generated always as identity primary key unique,
  deck_id text not null references spellsource.decks (id) on delete cascade,
  card_id text not null references spellsource.cards (id) on delete cascade
);

create table spellsource.deck_player_attribute_tuples
(
  id bigint generated always as identity primary key unique,
  deck_id text not null references spellsource.decks (id) on delete cascade,
  attribute int not null,
  string_value text
);

comment on column spellsource.cards_in_deck.deck_id is 'deleting a deck deletes all its card references';
comment on column spellsource.cards_in_deck.card_id is 'cannot delete cards that are currently used in decks';

create table spellsource.deck_shares
(
  id bigint generated always as identity primary key unique,
  deck_id text not null references spellsource.decks (id) on delete cascade,
  share_recipient_id character varying references keycloak.user_entity (id) not null,
  trashed boolean not null default false,
  unique (deck_id, share_recipient_id)
);

create index on spellsource.deck_shares (trashed) where deck_shares.trashed is false;

comment on table spellsource.deck_shares is 'indicates a deck shared to a player'