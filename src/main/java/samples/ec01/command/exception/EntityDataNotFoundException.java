/*
 * Copyright (C) 2018 INFORMATION SERVICES INTERNATIONAL - DENTSU, LTD. All Rights Reserved.
 * 
 * Unless you have purchased a commercial license,
 * the following license terms apply:
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package samples.ec01.command.exception;

import org.iplass.mtp.ApplicationException;

/**
 * エンティティデータが見つからなかった場合、スローする例外。
 */
public class EntityDataNotFoundException extends ApplicationException {
	private static final long serialVersionUID = 8932829659888789788L;

	public EntityDataNotFoundException() {
		super();
	}

	public EntityDataNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EntityDataNotFoundException(String message) {
		super(message);
	}

	public EntityDataNotFoundException(Throwable cause) {
		super(cause);
	}
}
