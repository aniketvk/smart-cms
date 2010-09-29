/*
 *
 * This is a simple Content Management System (CMS)
 * Copyright (C) 2010  Imran M Yousuf (imyousuf@smartitengineering.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.smartitengineering.cms.spi.impl.workspace;

import com.smartitengineering.cms.api.workspace.Workspace;
import com.smartitengineering.cms.api.workspace.WorkspaceId;
import com.smartitengineering.cms.spi.workspace.PersistableRepresentationTemplate;
import com.smartitengineering.cms.spi.workspace.PersistableVariationTemplate;
import com.smartitengineering.domain.AbstractGenericPersistentDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author imyousuf
 */
public class PersistentWorkspace extends AbstractGenericPersistentDTO<PersistentWorkspace, WorkspaceId, Long> {

  private Workspace workspace;
  private boolean representationPopulated;
  private boolean variationPopulated;
  private boolean friendliesPopulated;
  private final List<PersistableRepresentationTemplate> representationTemplates = new ArrayList<PersistableRepresentationTemplate>();
  private final List<PersistableVariationTemplate> variationTemplates = new ArrayList<PersistableVariationTemplate>();
  private final List<WorkspaceId> friendlies = new ArrayList<WorkspaceId>();

  public List<WorkspaceId> getFriendlies() {
    return Collections.unmodifiableList(friendlies);
  }

  public void setFriendlies(Collection<? extends WorkspaceId> collection) {
    friendlies.clear();
    if (collection == null || collection.isEmpty()) {
      return;
    }
    friendlies.addAll(collection);
  }

  public void addFriendly(WorkspaceId friendly) {
    friendlies.add(friendly);
  }

  public void removeFriendly(WorkspaceId friendly) {
    friendlies.remove(friendly);
  }

  public List<PersistableRepresentationTemplate> getRepresentationTemplates() {
    return Collections.unmodifiableList(representationTemplates);
  }

  public void setRepresenationTemplates(Collection<? extends PersistableRepresentationTemplate> collection) {
    representationTemplates.clear();
    if (collection == null || collection.isEmpty()) {
      return;
    }
    representationTemplates.addAll(collection);
  }

  public void addRepresentationTemplate(PersistableRepresentationTemplate PersistableRepresentationTemplate) {
    representationTemplates.add(PersistableRepresentationTemplate);
  }

  public void removeRepresentationTemplate(PersistableRepresentationTemplate PersistableRepresentationTemplate) {
    representationTemplates.remove(PersistableRepresentationTemplate);
  }

  public List<PersistableVariationTemplate> getVariationTemplates() {
    return Collections.unmodifiableList(variationTemplates);
  }

  public void setVariationTemplates(Collection<? extends PersistableVariationTemplate> collection) {
    variationTemplates.clear();
    if (collection == null || collection.isEmpty()) {
      return;
    }
    variationTemplates.addAll(collection);
  }

  public void addVariationTemplate(PersistableVariationTemplate variationTemplate) {
    variationTemplates.add(variationTemplate);
  }

  public void removeRepresentationTemplate(PersistableVariationTemplate variationTemplate) {
    variationTemplates.remove(variationTemplate);
  }

  public Workspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(Workspace workspaceId) {
    this.workspace = workspaceId;
  }

  @Override
  public WorkspaceId getId() {
    if (workspace == null) {
      return null;
    }
    return workspace.getId();
  }

  public boolean isFriendliesPopulated() {
    return friendliesPopulated;
  }

  public void setFriendliesPopulated(boolean friendliesPopulated) {
    this.friendliesPopulated = friendliesPopulated;
  }

  public boolean isRepresentationPopulated() {
    return representationPopulated;
  }

  public void setRepresentationPopulated(boolean representationPopulated) {
    this.representationPopulated = representationPopulated;
  }

  public boolean isVariationPopulated() {
    return variationPopulated;
  }

  public void setVariationPopulated(boolean variationPopulated) {
    this.variationPopulated = variationPopulated;
  }

  @Override
  public void setId(WorkspaceId id) {
    throw new UnsupportedOperationException("setId not supported!");
  }

  @Override
  public boolean isValid() {
    return getId() != null;
  }
}