/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2013 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.sonar.api.issue;

public class Pagination {

  private int limit;
  private int page;
  private int size;

  public Pagination(int limit, int page, int size) {
    this.limit = limit;
    this.page = page;
    this.size = size;
  }

  public int page() {
    return page;
  }

  public int limit() {
    return limit;
  }

  public int size() {
    return size;
  }

  public int offset(){
    return (page - 1) * limit;
  }

  public int pages() {
    int p = (size / limit);
    if ((size % limit) > 0) {
      p++;
    }
    return p;
  }

  public boolean empty() {
    return size == 0;
  }
}
